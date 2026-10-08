package com.example.costostock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.costostock.data.model.Offer
import com.example.costostock.ui.auth.LoginScreen
import com.example.costostock.ui.buyer.HomeScreen
import com.example.costostock.ui.buyer.HomeScreenUiState
import com.example.costostock.ui.theme.CostoStockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dummyOffers = listOf(
            Offer(
                id = "1",
                sellerId = "s1",
                title = "Botella Metálica",
                description = "Apta para deportes al aire libre 600ml.",
                originalPrice = 3000.0,
                offerPrice = 1270.0,
                availableStock = 15,
                co2SavingsPerUnitKg = 1.2,
                latitude = -33.0245,
                longitude = -71.5518,
                address = "Viña del Mar",
                expirationTimestamp = System.currentTimeMillis() + (3600 * 24 * 1000),
                imageResId = R.drawable.botella
            ),
            Offer(
                id = "2",
                sellerId = "s2",
                title = "Producto prueba 18/8",
                description = "Producto prueba 18/8 de tecnología.",
                originalPrice = 2000.0,
                offerPrice = 1270.0,
                availableStock = 20,
                co2SavingsPerUnitKg = 0.5,
                latitude = -33.0220,
                longitude = -71.5530,
                address = "Valparaíso",
                expirationTimestamp = System.currentTimeMillis() + (3600 * 48 * 1000),
                imageResId = R.drawable.prueba
            ),
            Offer(
                id = "3",
                sellerId = "s3",
                title = "Peluche de apego",
                description = "Peluche de apego, de algodón con crochet.",
                originalPrice = 35000.0,
                offerPrice = 25400.0,
                availableStock = 8,
                co2SavingsPerUnitKg = 0.8,
                latitude = -33.0210,
                longitude = -71.5540,
                address = "Valparaíso",
                expirationTimestamp = System.currentTimeMillis() + (3600 * 48 * 1000),
                imageResId = R.drawable.conejo
            ),
            Offer(
                id = "4",
                sellerId = "s4",
                title = "Silla de Auto Convertible 360° Isofix Saturn Gris",
                description = "Características principales Rango: Grupos 0+/1/2/3, desde el nacimiento hasta 36 kg.",
                originalPrice = 450000.0,
                offerPrice = 342000.0,
                availableStock = 3,
                co2SavingsPerUnitKg = 5.4,
                latitude = -33.0180,
                longitude = -71.5500,
                address = "Concón",
                expirationTimestamp = System.currentTimeMillis() + (3600 * 12 * 1000),
                imageResId = R.drawable.silla
            )
        )

        setContent {
            CostoStockTheme {
                var currentScreen by remember { mutableStateOf("home") }
                var isSellerUser by remember { mutableStateOf(false) }

                when (currentScreen) {
                    "login" -> {
                        LoginScreen(
                            onLoginSuccess = { isSeller ->
                                isSellerUser = isSeller
                                currentScreen = "home"
                            },
                            onBackClick = {
                                currentScreen = "home"
                            }
                        )
                    }
                    else -> {
                        var uiState by remember { mutableStateOf(HomeScreenUiState(offers = dummyOffers)) }

                        HomeScreen(
                            uiState = uiState,
                            onSearchQueryChange = { query ->
                                val filtered = dummyOffers.filter {
                                    it.title.contains(query, ignoreCase = true) || it.description.contains(query, ignoreCase = true)
                                }
                                uiState = uiState.copy(searchQuery = query, offers = filtered)
                            },
                            onOfferClick = { offerId -> },
                            onOpenLogin = {
                                currentScreen = "login"
                            },
                            onOpenMenu = { }
                        )
                    }
                }
            }
        }
    }
}