plugins {
    `kotlin-dsl`
    `java-library`
}

repositories {
    mavenCentral()
    maven("https://files.minecraftforge.net/maven")
    maven("https://maven.parchmentmc.org")
    maven("https://api.modrinth.com/maven")
}

dependencies {
    implementation("net.minecraftforge.gradle:ForgeGradle:5.1.+")
    implementation("org.parchmentmc:librarian:1.+")
}
