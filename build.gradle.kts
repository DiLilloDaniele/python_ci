group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    id("ru.vyarus.use-python") version "3.0.0"
}

repositories {
    mavenCentral()
}

python {
    //pip 'module1:1.0'
    //pip 'module2:1.0'
    minPythonVersion = "3.2"
    minPipVersion = "9.0.1"

}

tasks.register<ru.vyarus.gradle.plugin.python.task.PythonTask>("myTask") {
    command = "-c print('sample')"
}

tasks.register<ru.vyarus.gradle.plugin.python.task.PythonTask>("discoverTests") {
    command = "-m unittest discover -s src"
}

