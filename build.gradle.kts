buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.GRADLE_TOOLS)
        classpath(Dependencies.KOTLIN_PLUGIN)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean").configure {
    delete("build")
}