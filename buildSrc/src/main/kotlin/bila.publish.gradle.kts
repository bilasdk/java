import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Bila Payment Gateway API")
        description.set("Bila Payment Gateway API - A payment processing API for Africa.\n\n## Overview\n\nThis API provides payment gateway functionality for:\n\n- **Account Management**: Manage payment accounts/wallets\n- **Bank Operations**: Access bank reference data\n- **Account Resolution**: Verify bank and mobile money accounts\n- **Transfer Recipients**: Manage saved transfer recipients\n- **Transfers (Payouts)**: Send money to bank accounts and mobile money\n- **Collections (Receive Payments)**: Collect payments via mobile money\n- **Transaction History**: View all transactions\n\n## Mobile Money Providers\n\n- Airtel Money\n- MTN Mobile Money (MoMo)\n- Zamtel Kwacha\n\n## Countries Supported\n\n- Zambia (zm)\n\n## Authentication\n\nUse your merchant API key in the `x-api-key` header. You can generate API keys\nfrom your merchant dashboard.\n\n## Base URL\n\n```\nhttps://api.usebila.com/api/v1\n```\n\nFor sandbox/testing:\n\n```\nhttps://sandbox.usebila.com/api/v1\n```")
        url.set("https://www.github.com/bilasdk/java")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Bila")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/bilasdk/java.git")
            developerConnection.set("scm:git:git://github.com/bilasdk/java.git")
            url.set("https://github.com/bilasdk/java")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
