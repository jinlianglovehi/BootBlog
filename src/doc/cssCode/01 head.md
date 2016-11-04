
#### head 的处理

> 代表的是 头部的head 的切换的操作
```css
<!-- Main navbar  -->
<div class="navbar navbar-default navbar-lg header-highlight">
	<div class="navbar-header">
		<a class="navbar-brand" href="index.html"><img src="assets/images/logo_light.png" alt=""/></a>

		<ul class="nav navbar-nav pull-right visible-xs-block">
			<li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
			<li><a class="sidebar-mobile-main-toggle"><i class="icon-paragraph-justify3"></i></a></li>
			<li><a class="sidebar-mobile-detached-toggle"><i class="icon-grid7"></i></a></li>
		</ul>
	</div>

	<div class="navbar-collapse collapse" id="navbar-mobile">
		<ul class="nav navbar-nav">
			<li><a class="sidebar-control sidebar-main-hide hidden-xs"><i class="icon-paragraph-justify3"></i></a></li>
			<li><a class="sidebar-control sidebar-detached-hide hidden-xs"><i class="icon-drag-right"></i></a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="other_changelog.html#roadmap.html">Roadmap</a></li>
			<li><a href="other_changelog.html">Changelog <span class="label label-inline bg-warning-400 position-right">v. 1.0</span></a></li>
		</ul>
	</div>
</div>
<!-- /main navbar -->


```