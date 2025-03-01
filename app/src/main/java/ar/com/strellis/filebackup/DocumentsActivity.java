package ar.com.strellis.filebackup;

import android.content.pm.ResolveInfo;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apps.solidfilemamnager.BaseActivity;
import com.example.apps.solidfilemamnager.model.DocumentInfo;
import com.example.apps.solidfilemamnager.model.DocumentStack;
import com.example.apps.solidfilemamnager.model.RootInfo;

import java.util.List;

public class DocumentsActivity extends BaseActivity implements MenuItem.OnMenuItemClickListener
{
    @Override
    public State getDisplayState() {
        return null;
    }

    @Override
    public RootInfo getCurrentRoot() {
        return null;
    }

    @Override
    public void onStateChanged() {

    }

    @Override
    public void setRootsDrawerOpen(boolean open) {

    }

    @Override
    public void onDocumentPicked(DocumentInfo doc) {

    }

    @Override
    public void onDocumentsPicked(List<DocumentInfo> docs) {

    }

    @Override
    public DocumentInfo getCurrentDirectory() {
        return null;
    }

    @Override
    public void setPending(boolean pending) {

    }

    @Override
    public void onStackPicked(DocumentStack stack) {

    }

    @Override
    public void onPickRequested(DocumentInfo pickTarget) {

    }

    @Override
    public void onAppPicked(ResolveInfo info) {

    }

    @Override
    public void onRootPicked(RootInfo root, boolean closeDrawer) {

    }

    @Override
    public void onSaveRequested(DocumentInfo replaceTarget) {

    }

    @Override
    public void onSaveRequested(String mimeType, String displayName) {

    }

    @Override
    public boolean isCreateSupported() {
        return false;
    }

    @Override
    public RootInfo getDownloadRoot() {
        return null;
    }

    @Override
    public boolean getActionMode() {
        return false;
    }

    @Override
    public void setActionMode(boolean actionMode) {

    }

    @Override
    public void setUpStatusBar() {

    }

    @Override
    public void setUpDefaultStatusBar() {

    }

    @Override
    public boolean isShowAsDialog() {
        return false;
    }

    @Override
    public void upadateActionItems(RecyclerView mCurrentView) {

    }

    @Override
    public void setInfoDrawerOpen(boolean open) {

    }

    @Override
    public void again() {

    }

    @Override
    public String getTag() {
        return "";
    }

    @Override
    public boolean onMenuItemClick(@NonNull MenuItem menuItem) {
        return false;
    }
}
