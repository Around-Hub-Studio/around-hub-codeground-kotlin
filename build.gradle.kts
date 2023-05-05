import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.7.10"
  id("org.jlleitschuh.gradle.ktlint") version "11.3.2"
  application
}

group = "studio.aroundhub"
version = "0.0.1"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "17"
}

application {
  mainClass.set("MainKt")
}
