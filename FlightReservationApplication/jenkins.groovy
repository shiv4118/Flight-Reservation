pipeline {
    agent any
    stages {
        stage('Pull'){
            steps{
                git branch: 'main', credentialsId: 'jenkis-demo', url: 'https://github.com/shiv4118/Flight-Reservation.git'
            }
        }
        stage('build'){
            steps{
                sh '''
                    mvn clean package
                '''
            }
        }
        stage('test'){
            steps{
                echo "test the request"
            }
        }
        stage('deploy'){
            steps{
                echo "deploy the request"
            }
        }
    }    
}
