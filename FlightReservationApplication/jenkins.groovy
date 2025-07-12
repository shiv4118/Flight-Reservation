pipeline {
    agent any
    stages {
        stage('Pull'){
            steps{
                echo "pull the request"
            }
        }
        stage('build'){
            steps{
                echo "build the request"
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
