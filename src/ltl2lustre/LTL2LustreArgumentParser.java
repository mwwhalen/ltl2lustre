package ltl2lustre;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;

public class LTL2LustreArgumentParser extends ArgumentParser {
	private static final String G_UNDER_NEGATION = "G_under_negation";

	private final LTL2LustreSettings settings;

	private LTL2LustreArgumentParser() {
		this("LTL2Lustre", new LTL2LustreSettings());
	}

	private LTL2LustreArgumentParser(String name, LTL2LustreSettings settings) {
		super(name, settings);
		this.settings = settings;
	}

	@Override
	protected Options getOptions() {
		Options options = super.getOptions();
		options.addOption(G_UNDER_NEGATION, false, "allow G under negation: this allows G properties on LHS of implications to be (inaccurately) translated.");
		return options;
	}

	public static LTL2LustreSettings parse(String[] args) {
		LTL2LustreArgumentParser parser = new LTL2LustreArgumentParser();
		parser.parseArguments(args);
		parser.checkSettings();
		return parser.settings;
	}

	@Override
	protected void parseCommandLine(CommandLine line) {
		super.parseCommandLine(line);

		if (line.hasOption(G_UNDER_NEGATION)) {
			settings.allowGUnderNegation = true;
		}
	}

	private void checkSettings() { }
}
