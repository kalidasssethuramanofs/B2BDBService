pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn test'
                }
            }
        }
        
         stage ('Checkstyle Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn checkstyle:checkstyle'
                }
            }
        }

		stage('SonarQube analysis') {
            steps {
                // Optionally use a Maven environment you've configured already
                withMaven(maven: 'maven_3_5_0') {
                    bat 'mvn sonar:sonar'
                }
            }
        }

 		stage('SonarQube analysis1') {
	     steps {
				withSonarQubeEnv('mysonarqube') {
				// requires SonarQube Scanner for Maven 3.2+
				bat 'mvn sonar:sonar'
      			//bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
				}
			}
  		}

		stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}