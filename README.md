# 📦 Costo Stock SpA - Mobile App (Android)

> **Marketplace móvil de Excedentes de Inventario (Overstock) y Medición de Impacto Ambiental (CO₂)**  
> Proyecto desarrollado para la asignatura **DSY1105 - Desarrollo de Aplicaciones Móviles** (Duoc UC / CITT Sede Viña del Mar).

---

## 📄 Descripción del Proyecto

**Costo Stock SpA** es una plataforma orientada a la economía circular que reintroduce al mercado excedentes de inventario (*overstock*), productos próximos a vencer o de término de temporada mediante georreferenciación, minimizando pérdidas comerciales y desperdicios.

Este repositorio contiene la solución móvil nativa para Android, desarrollada para extender el alcance hacia usuarios que requieren notificaciones en tiempo real, ofertas geolocalizadas y la visualización del impacto ambiental (reducción de emisiones de CO₂ en el marco de la Ley REP N.º 20.920).

---

## 🎯 Definición del MVP (Producto Mínimo Viable)

El **MVP** de la aplicación móvil tiene como objetivo principal validar la experiencia de compra geolocalizada de excedentes de inventario y la entrega del indicador de CO₂ evitado por cada transacción.

### Alcance del MVP:
1. **Autenticación y Perfiles:** Registro e inicio de sesión según rol (Comprador, Proveedor/Vendedor, Administrador).
2. **Exploración Geolocalizada (Comprador):** Visualización de ofertas vigentes en vista de mapa o lista con contador regresivo de tiempo y stock.
3. **Módulo de Interacción:** Sistema de preguntas/respuestas acotado (máximo 2 consultas por producto).
4. **Flujo de Compra y Voucher Digital:** Simulación de checkout/pasarela de pago y generación inmediata del voucher de retiro con el desglose del CO₂ evitado.
5. **Gestión de Ofertas (Proveedor):** Carga de promociones en overstock, definición de stock, vigencia temporal y métricas básicas de venta/impacto ambiental.
6. **Aprobación de Contenido (Administrador):** Validación e incorporación de nuevos proveedores y aprobación de publicaciones.

---

## 👥 Funcionalidades por Perfil de Usuario

### 🛍️ 1. Usuario Comprador (Perfil Principal)
- [ ] **Catálogo Geolocalizado:** Explorar productos en lista o mapa interactivo según la cercanía del comercio.
- [ ] **Detalle de Producto:** Consultar precio original vs. precio oferta, unidades disponibles y temporizador en tiempo real.
- [ ] **Módulo de Preguntas:** Realizar hasta **2 preguntas por producto** al vendedor antes de comprar.
- [ ] **Proceso de Pago (Simulado):** Realizar la compra de la promoción.
- [ ] **Voucher Digital con Impacto CO₂:** Generar un comprobante de retiro que desglose la estimación de emisiones de carbono evitadas por la compra.
- [ ] **Notificaciones Push:** Recibir alertas sobre ofertas cercanas y notificaciones de vencimiento de promociones.

### 🏪 2. Proveedor / Vendedor (Perfil Secundario)
- [ ] **Publicación de Overstock:** Formulario para cargar nuevos productos, definir stock y ventana temporal de vigencia.
- [ ] **Gestión de Puntos de Retiro:** Configurar la ubicación geográfica (dirección/coordenadas) para el retiro de productos.
- [ ] **Panel de Métricas:** Visualizar resumen de ventas realizadas y total de huella de carbono ahorrada mediante sus ventas.

### 🛡️ 3. Administrador (Perfil Secundario)
- [ ] **Gestión de Proveedores:** Validar y aprobar la incorporación de nuevos comercios a la plataforma.
- [ ] **Moderación de Ofertas:** Revisar y aprobar las promociones publicadas antes de ser visibilizadas en la app.

---

## 🛠️ Stack Tecnológico y Arquitectura

- **Lenguaje:** [Kotlin](https://kotlinlang.org/)
- **Entorno de Desarrollo:** Android Studio
- **UI Framework:** [Jetpack Compose](https://developer.android.com/jetpack/compose) + [Material Design 3](https://m3.material.io/)
- **Arquitectura:** MVVM (Model-View-ViewModel)
- **Persistencia Local:** [Room Database](https://developer.android.com/training/data-storage/room) / SQLite
- **Conexión de Red:** [Retrofit 2](https://square.github.io/retrofit/) + GSON Converter
- **Backend Remoto:** Microservicios en Spring Boot (API REST)
- **Servicios de Ubicación:** Google Location Services (GPS y Geolocalización)
- **Notificaciones:** Push Notifications / AlarmManager / NotificationManager

---

## 🔒 Privacidad y Cumplimiento Normativo

- La aplicación cumple con la **Ley N.º 21.719** y **Ley N.º 19.628** sobre protección de datos personales.
- Toda la información empleada para las pruebas utiliza datasets ficticios o datos anonimizados.
- Los permisos de ubicación GPS operan mediante simulación y sets de datos controlados para no vulnerar la privacidad real del usuario.

---

## 📋 Requisitos de Ejecución

1. **Dispositivo u Emulador:** Android 8.0 (API Nivel 26) o superior.
2. **Conectividad:** Conexión activa a Internet.
3. **Permisos:** Ubicación (GPS) concedida en el dispositivo.

---

## 🚀 Entregables Técnicos del Proyecto

- [x] Código fuente alojado en este repositorio **GitHub**.
- [x] Tablero de seguimiento y metodología ágil en **Trello**.
- [x] Compilación final en formato **APK firmado en modo Release**.
