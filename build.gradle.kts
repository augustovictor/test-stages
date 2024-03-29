import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("plugin.jpa") version "1.2.71"
	id("org.springframework.boot") version "2.1.6.RELEASE"
	id("io.spring.dependency-management") version "1.0.7.RELEASE"
	kotlin("jvm") version "1.2.71"
	kotlin("plugin.spring") version "1.2.71"
}

group = "augustovictor.com.github"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.flywaydb:flyway-core")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	runtimeOnly("org.postgresql:postgresql")
	compile("org.postgresql:postgresql:42.1.4")
	testCompile("org.testcontainers:postgresql:1.11.3")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

tasks.test {
	useJUnit {
		includeCategories("augustovictor.com.github.teststages.UnitTest")
	}

	testLogging {
		events("PASSED", "FAILED", "SKIPPED")
	}
}

task<Test>("context-load") {
	failFast = true

	useJUnit {
		includeCategories("augustovictor.com.github.teststages.ContextLoad")
	}

	testLogging {
		events("PASSED", "FAILED", "SKIPPED")
	}
}

task<Test>("database-test") {
	dependsOn(tasks.getByName("context-load"))

	useJUnit {
		includeCategories("augustovictor.com.github.teststages.DatabaseTest")
	}

	testLogging {
		events("PASSED", "FAILED", "SKIPPED")
	}
}

task<Test>("integration") {
	dependsOn(tasks.test)

	useJUnit {
		includeCategories("augustovictor.com.github.teststages.IntegrationTest")
	}

	testLogging {
		events("PASSED", "FAILED", "SKIPPED")
	}
}