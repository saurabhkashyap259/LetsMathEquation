package com.mate.letsmathequation.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mate.letsmathequation.R;

import io.github.kexanie.library.MathView;

/**
 * Created by sasuke on 26/6/16.
 */
public class HomeFragment extends Fragment {

    MathView formula_two;
    MathView formula_three;
    String tex = "This come from string. You can insert inline formula:" +
            " \\(ax^2 + bx + c = 0\\) " +
            "or displayed formula: $$\\sum_{i=0}^n i^2 = \\frac{(n^2+n)(2n+1)}{6}$$";
    String mathml =
            "<math xmlns=\"http://www.w3.org/1998/Math/MathML\" display=\"block\" mathcolor=\"black\">\n" +
                    "  <mrow>\n" +
                    "    <mi>f</mi>\n" +
                    "    <mrow>\n" +
                    "      <mo>(</mo>\n" +
                    "      <mi>a</mi>\n" +
                    "      <mo>)</mo>\n" +
                    "    </mrow>\n" +
                    "  </mrow>\n" +
                    "  <mo>=</mo>\n" +
                    "  <mrow>\n" +
                    "    <mfrac>\n" +
                    "      <mn>1</mn>\n" +
                    "      <mrow>\n" +
                    "        <mn>2</mn>\n" +
                    "        <mi>&#x3C0;</mi>\n" +
                    "        <mi>i</mi>\n" +
                    "      </mrow>\n" +
                    "    </mfrac>\n" +
                    "    <msub>\n" +
                    "      <mo>&#x222E;</mo>\n" +
                    "      <mrow>\n" +
                    "        <mi>&#x3B3;</mi>\n" +
                    "      </mrow>\n" +
                    "    </msub>\n" +
                    "    <mfrac>\n" +
                    "      <mrow>\n" +
                    "        <mi>f</mi>\n" +
                    "        <mo>(</mo>\n" +
                    "        <mi>z</mi>\n" +
                    "        <mo>)</mo>\n" +
                    "      </mrow>\n" +
                    "      <mrow>\n" +
                    "        <mi>z</mi>\n" +
                    "        <mo>&#x2212;</mo>\n" +
                    "        <mi>a</mi>\n" +
                    "      </mrow>\n" +
                    "    </mfrac>\n" +
                    "    <mi>d</mi>\n" +
                    "    <mi>z</mi>\n" +
                    "  </mrow>\n" +
                    "</math>";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        formula_two = (MathView) rootView.findViewById(R.id.formula_two);
        formula_three = (MathView) rootView.findViewById(R.id.formula_three);
        formula_two.setText(tex);
        formula_three.setText(mathml);

        return rootView;
    }

    @Override
    public void onViewCreated(View rootView, Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);
    }
}
