package com.hm.achievement.module;

import com.hm.achievement.command.executable.*;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public interface CommandModule {

	@Binds
	@IntoSet
	abstract AbstractCommand bindHelpCommand(HelpCommand helpCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindBookCommand(BookCommand bookCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindInfoCommand(InfoCommand infoCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindListCommand(ListCommand listCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindRPCommand(RankPointsCommand rankPointsCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindStatsCommand(StatsCommand statsCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindReloadCommand(ReloadCommand reloadCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindToggleCommand(ToggleCommand toggleCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindGenerateCommand(GenerateCommand generateCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindEasterEggCommand(EasterEggCommand easterEggCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindTopCommand(TopCommand topCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindWeekCommand(WeekCommand weekCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindMonthCommand(MonthCommand monthCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindGiveCommand(GiveCommand giveCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindResetCommand(ResetCommand resetCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindCheckCommand(CheckCommand checkCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindDeleteCommand(DeleteCommand deleteCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindAddCommand(AddCommand addCommand);

	@Binds
	@IntoSet
	abstract AbstractCommand bindUpdate13Command(Upgrade13Command upgrade13Command);

	@Binds
	@IntoSet
	abstract AbstractCommand bindInspectCommand(InspectCommand inspectCommand);
}
