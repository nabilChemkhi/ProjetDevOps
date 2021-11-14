pipeline {
    agent any 
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
		}
		post{
		emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
                subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}"
            cleanWs()
		
    }
}