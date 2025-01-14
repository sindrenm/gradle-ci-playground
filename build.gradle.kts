plugins {
  alias(libs.plugins.kotlin.jvm)
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(libs.slf4j.api)
  testImplementation(libs.junit4)
}
