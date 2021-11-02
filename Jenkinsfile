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
		stage("Sonar") {
            steps {
				bat """mvn sonar:sonar""";
				echo'sonar'
            }
        }
		stage("Nexus") {
            steps {
				bat """mvn deploy""";
				echo'nexus'
            }}
        
		post{
		success{
		emailext body: 'build success', subjevt:'Jenkins', to:'nabil.chemkhi@esprit.tn'
		}
		failure{
		emailext body: 'build success', subjevt:'Jenkins', to:'nabil.chemkhi@esprit.tn'
		}
		}
    }
}