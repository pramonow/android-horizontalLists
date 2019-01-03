package pramonow.com.endlesspageadapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SampleAdapter : RecyclerView.Adapter<SampleAdapter.SampleVH>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): SampleVH {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.adapter_sample, viewGroup, false)
        return SampleVH(view)
    }

    override fun onBindViewHolder(sampleVH: SampleVH, i: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }


    inner class SampleVH(itemView: View) : RecyclerView.ViewHolder(itemView)
}
