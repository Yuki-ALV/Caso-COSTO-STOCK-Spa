package com.example.costostock.data.model

enum class OfferStatus { PENDING, APPROVED, REJECTED, EXPIRED }

data class Offer(
    val id: String,
    val sellerId: String,
    val title: String,
    val description: String,
    val originalPrice: Double,
    val offerPrice: Double,
    val availableStock: Int,
    val co2SavingsPerUnitKg: Double,
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val expirationTimestamp: Long,
    val imageResId: Int, // Referencia a la imagen en res/drawable
    val status: OfferStatus = OfferStatus.APPROVED
)