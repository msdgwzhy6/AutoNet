package cn.xiaoxige.autonet_api.interactors;

import cn.xiaoxige.autonet_api.abstracts.BaseUseCase;
import cn.xiaoxige.autonet_api.repository.AutoNetRepo;
import io.reactivex.Flowable;

/**
 * @author by zhuxiaoan on 2018/5/21 0021.
 *         The branch of the way to upload a file request
 */

public class AutoNetPullFileUseCase extends BaseUseCase {

    private AutoNetRepo mRepo;
    private String mFilePath;
    private String mFileName;

    public AutoNetPullFileUseCase(AutoNetRepo repo, String filePath, String fileName) {
        this.mRepo = repo;
        this.mFilePath = filePath;
        this.mFileName = fileName;
    }

    @Override
    protected Flowable getFlowable() {
        return mRepo.pullFile(mFilePath, mFileName);
    }
}
