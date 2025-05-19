plugins {
    id("java")
}

group = "ru.netology.service"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("io.rest-assured:rest-assured:5.5.0")
    testImplementation ("io.rest-assured:json-schema-validator:5.5.0")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.10.2")

}

tasks.test {
    useJUnitPlatform()
}