def call(){
	region = GetRegion()
	stage('my stage'){
		agent any
		steps{
			echo "Deploying on ${region} region"
		}
	}
}

def GetRegion() {
	if ( config.DisasterRecoveryMode ){
		return "eu-central-1"
	}
	else {
		return "eu-west-1"
	}
}
