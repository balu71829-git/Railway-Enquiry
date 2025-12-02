pipeline {
    agent any

    tools {
        maven 'Maven3'    // Name of Maven installation in Jenkins
        jdk 'Java21'       // Name of JDK installed in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/balu71829-git/Railway-Enquiry.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project using Maven...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging Spring Boot application...'
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build and tests successful!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
