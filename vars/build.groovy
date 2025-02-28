def call(string projectname,string imagetag , string DockerHubUser){
  sh "docker build -t "${DockerHubUser}"/"${projectname}":"${imagetag}
}
