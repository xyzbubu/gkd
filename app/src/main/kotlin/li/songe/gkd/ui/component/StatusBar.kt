package li.songe.gkd.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.ConvertUtils

@Composable
fun StatusBar() {
    Spacer(
        modifier = Modifier
            .height(statusBarHeight)
            .fillMaxWidth()
    )
}

val statusBarHeight by lazy {
    Dp(
        ConvertUtils.px2dp(BarUtils.getStatusBarHeight().toFloat()).toFloat()
    )
}