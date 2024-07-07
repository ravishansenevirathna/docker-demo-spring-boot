pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building Spring Boot application...'
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                bat 'docker build -t my-spring-app .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                echo 'Pushing Docker image to Docker Hub...'
                withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'DOCKER_HUB_PASSWORD', usernameVariable: 'DOCKER_HUB_USERNAME')]) {
                    bat 'docker login -u %DOCKER_HUB_USERNAME% -p %DOCKER_HUB_PASSWORD%'
                    bat 'docker tag my-spring-app myusername/my-spring-app:latest'
                    bat 'docker push myusername/my-spring-app:latest'
                }
            }
        }
    }
}