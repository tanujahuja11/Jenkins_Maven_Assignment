pipeline {
    agent any

    tools{ maven 'MAVEN_HOME'
         }
    stages {
        stage('Build') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                 bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                 bat "mvn clean test"
            }
        }
    }
}
