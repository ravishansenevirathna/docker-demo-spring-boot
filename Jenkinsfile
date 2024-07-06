pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building Spring Boot application...'
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                sh 'docker build -t my-spring-app .'
            }
        }

//         stage('Push to Docker Hub') {
//             steps {
//                 echo 'Pushing Docker image to Docker Hub...'
//                 withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'DOCKER_HUB_PASSWORD', usernameVariable: 'DOCKER_HUB_USERNAME')]) {
//                     sh 'docker login -u $DOCKER_HUB_USERNAME -p $DOCKER_HUB_PASSWORD'
//                     sh 'docker tag my-spring-app myusername/my-spring-app:latest'
//                     sh 'docker push myusername/my-spring-app:latest'
//                 }
//             }
//         }
    }
}