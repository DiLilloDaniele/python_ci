group = "org.example"
version = "1.0-SNAPSHOT"

extensions.configure<com.linkedin.gradle.python.PythonExtension>("python") {
    details.setSystemPythonInterpreter("/usr/local/bin/python3")
    details.setPythonVersion("3.9")
}

plugins {
    id("com.linkedin.python-sdist") version "0.3.9"
}

dependencies {
    python 'pypi:requests:2.9.1'
    test 'pypi:mock:2.0.0'
}

repositories {
    pyGradlePyPi()
}
