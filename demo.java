package cn.edu.pku.sei.srmain;

import cn.edu.pku.sei.common.Global;
import cn.edu.pku.sei.gitparser.DiffExtractor;
import cn.edu.pku.sei.gitparser.GitExtractor;
import cn.edu.pku.sei.smartreview.DoDiffFileCore;
import cn.edu.pku.sei.smartreview.SmartReview;

import java.util.List;

public class OneCommitDecomposition {

    public static void main(String[] args){
        Global.runningMode = 0;

        String repo = "F:\\SR-Open-Source-Projects\\jruby\\.git";

        String commitId = "8f09829c50fd87cb9c8c4787e4f996ecf049056e";
        String outputDir = "F://SR_result";
        String graphDirPath = "F://SR_GraphData/jruby/8f09829c50fd87cb9c8c4787e4f996ecf049056e";
        DiffExtractor diffExtractor = new DiffExtractor();
        diffExtractor.run(repo,commitId,outputDir,graphDirPath);

    }
}
