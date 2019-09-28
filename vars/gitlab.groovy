def isMergeRequest(){
    try {
        gitlabMergeRequestIId
        true

    } catch (e) {
        return false
    }
}

def getMergeRequestInfo(){
	"PR-${getMergeRequestId()}, branch: ${(getSourceBranch())} by ${getMergeRequestByFullName()}\n${getMergeRequestUrl()}"
}

def getMergeRequestUrl(){
    "${gitlabTargetRepoHttpUrl.minus('.git')}/merge_requests/$gitlabMergeRequestIId"
}

def getMergeRequestId(){
    gitlabMergeRequestIId
}

def getSourceBranch(){
    gitlabSourceBranch
}

def getMergeRequestByFullName(){
    gitlabUserName
}


