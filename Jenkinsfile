pipeline {
    agent any 

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
            }
        

    }
}