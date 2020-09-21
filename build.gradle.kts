import org.jetbrains.kotlin.kapt3.base.Kapt.kapt
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
    application
    kotlin("kapt") version "1.4.0"
}

repositories {
    mavenCentral()
    jcenter()
    maven(url="https://dl.bintray.com/arrow-kt/arrow-kt/")
}

val arrow_version = "0.11.0"

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("io.kotlintest:kotlintest-assertions-arrow:3.3.2")

    implementation("io.arrow-kt:arrow-core:$arrow_version")
/*
    implementation("io.arrow-kt:arrow-fx:$arrow_version")
    implementation("io.arrow-kt:arrow-optics:$arrow_version")
    implementation("io.arrow-kt:arrow-syntax:$arrow_version")
*/
    kapt("io.arrow-kt:arrow-meta:$arrow_version")
}

application {
    mainClassName = "kotlinnull.AppKt"
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "13"
}
