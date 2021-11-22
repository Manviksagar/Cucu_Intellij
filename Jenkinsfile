pipeline {
    agent any
    stages {
        stage("build") {
            steps {
                'mvn --version'
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


    }
}
