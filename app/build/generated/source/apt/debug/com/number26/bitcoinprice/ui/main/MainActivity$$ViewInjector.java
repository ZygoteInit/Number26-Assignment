// Generated code from Butter Knife. Do not modify!
package com.number26.bitcoinprice.ui.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.number26.bitcoinprice.ui.main.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230786, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131230786, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131230785, "field 'mygraphyView'");
    target.mygraphyView = finder.castView(view, 2131230785, "field 'mygraphyView'");
    view = finder.findRequiredView(source, 2131230784, "field 'btnBarChart' and method 'barGraph'");
    target.btnBarChart = finder.castView(view, 2131230784, "field 'btnBarChart'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.barGraph();
        }
      });
    view = finder.findRequiredView(source, 2131230783, "field 'btnLineChart' and method 'lineGraph'");
    target.btnLineChart = finder.castView(view, 2131230783, "field 'btnLineChart'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.lineGraph();
        }
      });
  }

  @Override public void reset(T target) {
    target.progressBar = null;
    target.mygraphyView = null;
    target.btnBarChart = null;
    target.btnLineChart = null;
  }
}
