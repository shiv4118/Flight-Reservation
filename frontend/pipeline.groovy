pipeline {
    agent any
    stages {
        stage('PULL'){
            steps{
                git branch: 'main', url: 'https://github.com/mayurmwagh/flight-reservation-demo.git'
            }
        }
        stage('BUILD'){
            steps {
                sh'''
                    cd frontend
                    npm install
                    npm run build
                '''
            }
        }
        stage('DEPLOY'){
            steps{
                sh'''
                cd frontend
                aws s3 sync dist/ s3://cbz-frontend-project-bux/ 
                '''
            }
        }
    }
}