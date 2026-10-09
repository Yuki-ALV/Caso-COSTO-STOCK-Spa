# 📦 Costo Stock SpA - Ecosistema de Soluciones

> **Plataforma de Excedentes de Inventario (Overstock) y Medición de Impacto Ambiental (CO₂)**  
> Proyecto desarrollado para la asignatura **DSY1105 - Desarrollo de Aplicaciones Móviles** (Duoc UC / CITT Sede Viña del Mar).

---

## 📄 Descripción del Proyecto

**Costo Stock SpA** es una plataforma orientada a la economía circular que reintroduce al mercado excedentes de inventario (*overstock*), productos próximos a vencer o de término de temporada mediante georreferenciación.

Para optimizar la experiencia de uso según el perfil, la solución se compone de **tres componentes clave**:
1. **App Móvil Clientes (Android):** Enfocada en el descubrimiento de ofertas cercanas y compra rápida.
2. **App Móvil Proveedores (Android):** Diseñada para la publicación ágil de promociones y gestión de stock.
3. **Dashboard Web Administrador:** Panel centralizado para control, moderación y análisis de estadísticas globales.

---

## 🎯 Definición del MVP (Producto Mínimo Viable)

El **MVP** de la plataforma busca validar el flujo completo de economía circular: desde la carga de overstock por parte del comercio, pasando por la compra geolocalizada del cliente, hasta el monitoreo de indicadores de huella de carbono ($\text{CO}_2$ evitado) a nivel global e individual.

---

## 🚀 Componentes de la Solución

### 🛍️ 1. Aplicación Móvil - Clientes (Android)
Diseñada para compradores que buscan promociones geolocalizadas con experiencia nativa y notificaciones en tiempo real.

- **Catálogo y Mapa:** Exploración de productos en lista o mapa interactivo con GPS.
- **Detalle e Interacción:** Visualización de precio original vs. oferta, stock disponible, temporizador regresivo y módulo de consultas (máximo 2 preguntas por producto).
- **Checkout Simulado:** Flujo de compra y generación de voucher digital de retiro.
- **Reporte Ambiental:** Cálculo del $\text{CO}_2$ evitado por cada transacción realizada.
- **Notificaciones Push:** Alertas de promociones cercanas y vencimiento de ofertas.

---

### 🏪 2. Aplicación Móvil - Proveedores / Vendedores (Android)
Herramienta operativa para que los comercios gestionen sus excedentes de inventario de forma rápida desde un smartphone.

- **Carga de Overstock:** Formulario para agregar productos, definir stock, precio y ventana temporal de vigencia.
- **Puntos de Retiro:** Configuración de coordenadas GPS y dirección del local para el retiro del producto.
- **Métricas del Comercio:** Consulta de ventas realizadas y resumen del ahorro de huella de carbono generado por sus publicaciones.

---

### 📊 3. Dashboard Web - Administrador
Panel web de control diseñado para la supervisión del sistema y la toma de decisiones basada en datos.

- **Gestión y Moderación:** Validación/aprobación de nuevos proveedores y revisión de publicaciones de ofertas antes de hacerse visibles.
- **Métricas y Estadísticas Globales:**
  - Volumen total de ventas e ingresos del marketplace.
  - Indicador acumulado de **huella de carbono ($\text{CO}_2$) evitada** (Ley REP N.º 20.920).
  - Tasa de rotación de productos en overstock y productos rescatados del desperdicio.
  - Mapa de calor con concentración geográfica de oferta y demanda.

---

## 🛠️ Stack Tecnológico y Arquitectura

### Aplicaciones Móviles (Clientes y Proveedores):
- **Lenguaje:** Kotlin (Android Studio)
- **UI Framework:** Jetpack Compose + Material Design 3
- **Arquitectura:** MVVM (Model-View-ViewModel)
- **Persistencia Local:** Room Database / SQLite
- **Conexión API:** Retrofit 2 + GSON (Spring Boot Backend)
- **Servicios:** Google Location Services (GPS) y Notificaciones Push

### Dashboard Web (
