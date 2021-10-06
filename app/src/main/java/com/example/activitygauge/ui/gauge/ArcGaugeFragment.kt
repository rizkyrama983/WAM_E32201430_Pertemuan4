package com.example.activitygauge.ui.gauge

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ekn.gruzer.gaugelibrary.Range
import com.ekn.gruzer.gaugelibrary.contract.ValueFormatter
import com.example.activitygauge.R
import kotlinx.android.synthetic.main.fragment_arc_gauge.*
import kotlinx.android.synthetic.main.gauge_halfgauge_fragment.*

class ArcGaugeFragment : Fragment() {

    companion object {
        fun newInstance() = ArcGaugeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arc_gauge, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 50.0

        val range2 = Range()
        range2.color = Color.parseColor("#E3E500")
        range2.from = 50.0
        range2.to = 100.0

        val range3 = Range()
        range3.color = Color.parseColor("#00b20b")
        range3.from = 100.0
        range3.to = 150.0

        arcGauge.minValue= 10.0
        arcGauge.maxValue = 150.0
        arcGauge.value = 35.0


        arcGauge.addRange(range)
        arcGauge.addRange(range2)
        arcGauge.addRange(range3)
        arcGauge.isUseRangeBGColor= true
        arcGauge.valueColor = Color.BLUE


        arcGauge.setFormatter(ValueFormatter {
            it.toInt().toString()
        })


        arcgauge_update_btn.setOnClickListener {
            arcGauge.value = arcgauge_value_ed.text.toString().toDouble()
        }


    }



}
