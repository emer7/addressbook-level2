package seedu.addressbook.commands;

/**
 * Sort all persons in the address book to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sort all persons in the address book alphabetically by name.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        addressBook.sort();
        return new CommandResult(String.format("Address Book sorted"));
    }
}
