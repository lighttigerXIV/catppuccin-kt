plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


publishing {

    publications {

        // Creates a Maven publication called "release".
        register("release", MavenPublication::class) {

            // Library Package Name (Example : "com.frogobox.androidfirstlib")
            // NOTE : Different GroupId For Each Library / Module, So That Each Library Is Not Overwritten
            groupId = "com.lighttigerxiv.catppuccin.kt"

            // Library Name / Module Name (Example : "androidfirstlib")
            // NOTE : Different ArtifactId For Each Library / Module, So That Each Library Is Not Overwritten
            artifactId = "catppuccin-kt"

            // Version Library Name (Example : "1.0.0")
            version = "0.0.3"

            from(components["java"])
        }

    }
}