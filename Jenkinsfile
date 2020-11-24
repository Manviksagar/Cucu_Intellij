pipeline {
    agent any
    stages {
        stage("build") {
            steps {
                echo 'mvn --version'
            }
        }
        stage("install") {
            steps {
                echo 'Installing stage'
            }
        }
        stage("Deploy") {
            steps {
                echo 'deploy'
            }
        }

        post {
                always {
                    cucumber '**/cucumber.json'
                }
    }
}