package fram.test888;

import com.hemaapp.hm_FrameWork.HemaActivity;
import com.hemaapp.hm_FrameWork.HemaNetTask;
import com.hemaapp.hm_FrameWork.HemaNetWorker;
import com.hemaapp.hm_FrameWork.result.HemaBaseResult;

/**
 * Created by Administrator on 2017-12-19.
 */

class aaa extends HemaActivity {
    @Override
    protected HemaNetWorker initNetWorker() {
        return null;
    }

    @Override
    protected void callBeforeDataBack(HemaNetTask netTask) {

    }

    @Override
    protected void callAfterDataBack(HemaNetTask netTask) {

    }

    @Override
    protected void callBackForServerSuccess(HemaNetTask netTask, HemaBaseResult baseResult) {

    }

    @Override
    protected void callBackForServerFailed(HemaNetTask netTask, HemaBaseResult baseResult) {

    }

    @Override
    protected void callBackForGetDataFailed(HemaNetTask netTask, int failedType) {

    }

    @Override
    public boolean onAutoLoginFailed(HemaNetWorker netWorker, HemaNetTask netTask, int failedType, HemaBaseResult baseResult) {
        return false;
    }

    @Override
    protected void findView() {

    }

    @Override
    protected void getExras() {

    }

    @Override
    protected void setListener() {

    }
}
