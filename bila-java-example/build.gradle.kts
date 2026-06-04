plugins {
    id("bila.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":bila-java-core"))
    implementation(project(":bila-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :bila-java-example:run` to run `Main`
    // Use `./gradlew :bila-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.bila.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
