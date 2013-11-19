package com.gpl.rpg.AndorsTrail.model.ability;

import com.gpl.rpg.AndorsTrail.model.ability.traits.AbilityModifierTraits;
import com.gpl.rpg.AndorsTrail.model.ability.traits.StatsModifierTraits;
import com.gpl.rpg.AndorsTrail.scripting.Script;

public final class ActorConditionType {
	public static enum ConditionCategory {
		spiritual, mental, physical, blood
	}

	public final String conditionTypeID;
	public final String name;
	public final int iconID;
	public final ConditionCategory conditionCategory;
	public final boolean isStacking;
	public final boolean isPositive;
	public final StatsModifierTraits statsEffect_everyRound;
	public final StatsModifierTraits statsEffect_everyFullRound;
	public final AbilityModifierTraits abilityEffect;
	public final String[] scripts;
	public final String[] private_scripts;

	public ActorConditionType(
			String conditionTypeID
			, String name
			, int iconID
			, ConditionCategory conditionCategory
			, boolean isStacking
			, boolean isPositive
			, StatsModifierTraits statsEffect_everyRound
			, StatsModifierTraits statsEffect_everyFullRound
			, AbilityModifierTraits abilityEffect
			, String[] scripts
			, String[] private_scripts
	) {
		this.conditionTypeID = conditionTypeID;
		this.name = name;
		this.iconID = iconID;
		this.conditionCategory = conditionCategory;
		this.isStacking = isStacking;
		this.isPositive = isPositive;
		this.statsEffect_everyRound = statsEffect_everyRound;
		this.statsEffect_everyFullRound = statsEffect_everyFullRound;
		this.abilityEffect = abilityEffect;
		this.scripts = scripts;
		this.private_scripts = private_scripts;
	}
}
