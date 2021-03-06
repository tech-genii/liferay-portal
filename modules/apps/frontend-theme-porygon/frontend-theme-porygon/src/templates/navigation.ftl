<div aria-expanded="true" class="collapse navbar-collapse" id="navigationCollapse">
	<nav class="navbar-nav site-navigation" id="navigation" role="navigation">
		<#assign preferencesMap = {"displayDepth": "1", "portletSetupPortletDecoratorId": "barebone"} />

		<@liferay.navigation_menu
			default_preferences=freeMarkerPortletPreferences.getPreferences(preferencesMap)
			instance_id="main_navigation_menu"
		/>

		<div class="user-area">
		</div>
	</nav>

	<div class="ml-auto nav navbar-user">
		<@liferay.user_personal_bar />
	</div>

	<#if show_header_main_search>
		<div class="navbar-form navbar-right" role="search">
			<div id="search">
				<@liferay.search default_preferences=freeMarkerPortletPreferences.getPreferences("portletSetupPortletDecoratorId", "barebone") />
			</div>

			<button aria-controls="navigation" class="btn btn-link btn-search hidden-xs" type="button">
				<svg class="lexicon-icon">
					<use xlink:href="${images_folder}/lexicon/icons.svg#search" />
				</svg>

				<svg class="lexicon-icon">
					<use xlink:href="${images_folder}/lexicon/icons.svg#times" />
				</svg>
			</button>
		</div>
	</#if>
</div>