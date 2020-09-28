plugins {
    java
    kotlin("jvm") version "1.4.10"
    kotlin("kapt") version "1.4.10"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

group = "com.nnt.signals"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/central")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
    }
}

repositories {
    maven("https://maven.aliyun.com/repository/central")
    maven("https://maven.aliyun.com/repository/apache-snapshots")
}

sourceSets {
    main {
        kotlin {
            java {
                srcDir("src/main")
            }
        }
    }

    test {
        kotlin {
            java {
                srcDir("src/test")
            }
        }
    }
}

dependencies {

    // kotlin
    implementation(kotlin("stdlib"))

    // test
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}
