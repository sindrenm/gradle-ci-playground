plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "dev.sindrenm.gcp"

  defaultConfig {
    minSdk = 30
    targetSdk = 35
    compileSdk = 35
  }
}

kotlin {
  jvmToolchain(21)
}

dependencies {
  implementation(libs.android.material)
  implementation(libs.androidx.activity)
}
