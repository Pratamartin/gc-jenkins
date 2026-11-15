pipeline {
    agent any

    tools {
        maven 'Maven-3'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B clean package -Dmaven.test.skip=true'
            }
        }

        stage('Testes') {
            steps {
                sh 'mvn -B test -Dmaven.test.failure.ignore=true'
            }

            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}