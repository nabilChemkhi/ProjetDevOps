pipeline {
    agent any 
    stages {
        stage('Checkout GIT') { 
            steps {
			    echo 'Pulling...'
				git branch: 'main',
				url : 'https://github.com/nabilChemkhi/ProjetDevOps.git';
            }
        }
        stage("Test, Build") {
            steps {
				bat """mvn clean install"""
            }
        }
		        stage("Package") {
            steps {
				bat """mvn clean package""";
				echo'test'
            }
        }
		post{
		success{
		emailext body: 'build success',
        subject: 'Jenkins',
        to: 'nabil.chemkhi@esprit.tn'
		}
		failure{
		emailext body: 'build failure',
        subject: 'Jenkins',
        to: 'nabil.chemkhi@esprit.tn'
		}
		}
    }
}