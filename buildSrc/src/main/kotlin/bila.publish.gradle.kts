plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Bila Payment Gateway API")
                description.set("Bila Payment Gateway API - A payment processing API for Africa.\n\n## Overview\n\nThis API provides payment gateway functionality for:\n\n- **Account Management**: Manage payment accounts/wallets\n- **Bank Operations**: Access bank reference data\n- **Account Resolution**: Verify bank and mobile money accounts\n- **Transfer Recipients**: Manage saved transfer recipients\n- **Transfers (Payouts)**: Send money to bank accounts and mobile money\n- **Collections (Receive Payments)**: Collect payments via mobile money\n- **Transaction History**: View all transactions\n\n## Mobile Money Providers\n\n- Airtel Money\n- MTN Mobile Money (MoMo)\n- Zamtel Kwacha\n\n## Countries Supported\n\n- Zambia (zm)\n- Nigeria (ng)\n\n## Authentication\n\nUse your merchant API key in the `x-api-key` header. You can generate API keys\nfrom your merchant dashboard.\n\n## Base URL\n\n```\nhttps://api.usebila.com/api/v1\n```\n\nFor sandbox/testing:\n\n```\nhttps://sandbox.usebila.com/api/v1\n```")
                url.set("https://www.github.com/stainless-sdks/bila-java")

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
                    connection.set("scm:git:git://github.com/stainless-sdks/bila-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/bila-java.git")
                    url.set("https://github.com/stainless-sdks/bila-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
