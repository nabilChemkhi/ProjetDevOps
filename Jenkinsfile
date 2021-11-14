pipeline {
    agent any 
    environment { 
        registry = "benour/timesheet" 
		registryCredential = 'dockerHub'
        dockerImage = '' 
       
    }
    stages {
        stage('Checkout GIT') { 
            steps {
			    echo 'Pulling...'
				git branch: 'benour',
				url : 'https://github.com/nabilChemkhi/ProjetDevOps.git';
            }
        }
        stage("Test, Build") {
            steps {
				bat "mvn clean install";
            }
        }
		        stage("Package") {
            steps {
				bat "mvn clean package";
				echo'test'
            }
        }
		stage("Sonar") {
            steps {
				bat "mvn sonar:sonar";
				echo'sonar'
            }
        }
		stage("Nexus") {
            steps {
				bat "mvn deploy";
            }
			}
		
		stage('Building Docker Image'){
				steps{
					script{
						dockerImage = docker.build registry + ":$BUILD_NUMBER"
					}
				}				
			}

			stage('Pushing Docker Image'){
				steps{
					script{
						docker.withRegistry( '', registryCredential ) 
                        {dockerImage.push()}
					}
				}
			}
			}
	post{
		success{
		emailext body: 'build success', subject: 'Jenkins', to: 'mohamedamine.benour@esprit.tn'
		}
		failure{
		emailext body: 'build failure', subject: 'Jenkins', to: 'mohamedamine.benour@esprit.tn'
		}
		
    }
}
