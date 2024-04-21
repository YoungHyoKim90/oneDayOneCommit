package M2024_03;

import java.io.File;
import java.util.Scanner;

public class FolderManipulator {
	public static void main(String[] args) {
		String folderPath = "C:/Users/kised/Desktop/HSO10Patch/bms - 복사본"; // 폴더 경로 지정

		File folder = new File(folderPath);

		if (folder.exists() && folder.isDirectory()) {
			File[] filesAndFolders = folder.listFiles();

			if (filesAndFolders != null && filesAndFolders.length > 0) {
				int count = 1;
				for (File fileOrFolder : filesAndFolders) {
					System.out.println(count + ". " + fileOrFolder.getName());
					count++;
				}
//

				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the number of the file or folder you want to interact with:");
				int choice = scanner.nextInt();

				if (choice >= 1 && choice <= filesAndFolders.length) {
					File selectedFileOrFolder = filesAndFolders[choice - 1];
					System.out.println("Selected item: " + selectedFileOrFolder.getName());

					System.out.println("1. Delete");
					System.out.println("2. Read (Print content)");

					int actionChoice = scanner.nextInt();

					if (actionChoice == 1) {
						if (selectedFileOrFolder.delete()) {
							System.out.println("File or folder deleted successfully.");
							scanner.close();
						} else {
							System.out.println("Failed to delete file or folder.");
							scanner.close();
						}
					} else if (actionChoice == 2) {
						// TODO: Implement read content functionality for files
						System.out.println("Read content functionality will be implemented soon.");
						scanner.close();
					} else {
						System.out.println("Invalid choice.");
						scanner.close();
					}
				} else {
					System.out.println("Invalid choice. Please enter a number between 1 and " + filesAndFolders.length);
					scanner.close();
				}
			} else {
				System.out.println("Folder is empty.");
			}
		} else {
			System.out.println("Folder does not exist or is not a directory.");
		}
	}
}

/*
 * 
 * java.io.File
 * 
 * 
 * An abstract representation of file and directory pathnames.
 * 
 * User interfaces and operating systems use system-dependent pathnamestrings to
 * name files and directories. This class presents anabstract,
 * system-independent view of hierarchical pathnames. An abstract pathname has
 * two components: 1. An optional system-dependent prefix string,such as a
 * disk-drive specifier, "/" for the UNIX rootdirectory, or "\\\\" for a
 * Microsoft Windows UNC pathname, and 2. A sequence of zero or more string
 * names. The first name in an abstract pathname may be a directory name or, in
 * thecase of Microsoft Windows UNC pathnames, a hostname. Each subsequent
 * namein an abstract pathname denotes a directory; the last name may
 * denoteeither a directory or a file. The empty abstract pathname has noprefix
 * and an empty name sequence. The conversion of a pathname string to or from an
 * abstract pathname isinherently system-dependent. When an abstract pathname is
 * converted into apathname string, each name is separated from the next by a
 * single copy ofthe default separator character. The default
 * name-separatorcharacter is defined by the system property file.separator,
 * andis made available in the public static fields separator and separatorChar
 * of this class.When a pathname string is converted into an abstract pathname,
 * the nameswithin it may be separated by the default name-separator character
 * or by anyother name-separator character that is supported by the underlying
 * system.
 * 
 * A pathname, whether abstract or in string form, may be either absolute or
 * relative. An absolute pathname is complete inthat no other information is
 * required in order to locate the file that itdenotes. A relative pathname, in
 * contrast, must be interpreted in terms ofinformation taken from some other
 * pathname. By default the classes in the java.io package always resolve
 * relative pathnames against thecurrent user directory. This directory is named
 * by the system property user.dir, and is typically the directory in which the
 * Javavirtual machine was invoked.
 * 
 * The parent of an abstract pathname may be obtained by invokingthe getParent
 * method of this class and consists of the pathname'sprefix and each name in
 * the pathname's name sequence except for the last.Each directory's absolute
 * pathname is an ancestor of any Fileobject with an absolute abstract pathname
 * which begins with the directory'sabsolute pathname. For example, the
 * directory denoted by the abstractpathname "/usr" is an ancestor of the
 * directory denoted by thepathname "/usr/local/bin".
 * 
 * The prefix concept is used to handle root directories on UNIX platforms,and
 * drive specifiers, root directories and UNC pathnames on Microsoft Windows
 * platforms,as follows: • For UNIX platforms, the prefix of an absolute
 * pathname is always "/". Relative pathnames have no prefix. The abstract
 * pathnamedenoting the root directory has the prefix "/" and an emptyname
 * sequence. • For Microsoft Windows platforms, the prefix of a pathname that
 * contains a drivespecifier consists of the drive letter followed by ":"
 * andpossibly followed by
 * "\\" if the pathname is absolute. Theprefix of a UNC pathname is "\\\\"; the
 * hostname and the sharename are the first two names in the name sequence. A
 * relative pathname thatdoes not specify a drive has no prefix.
 * 
 * Instances of this class may or may not denote an actual file-systemobject
 * such as a file or a directory. If it does denote such an objectthen that
 * object resides in a partition. A partition is anoperating system-specific
 * portion of storage for a file system. A singlestorage device (e.g. a physical
 * disk-drive, flash memory, CD-ROM) maycontain multiple partitions. The object,
 * if any, will reside on thepartition named by some ancestor of the
 * absoluteform of this pathname.
 * 
 * A file system may implement restrictions to certain operations on theactual
 * file-system object, such as reading, writing, and executing.
 * Theserestrictions are collectively known as access permissions. The
 * filesystem may have multiple sets of access permissions on a single
 * object.For example, one set may apply to the object's owner, and anothermay
 * apply to all other users. The access permissions on an object maycause some
 * methods in this class to fail.
 * 
 * Instances of the File class are immutable; that is, oncecreated, the abstract
 * pathname represented by a File objectwill never change.
 * 
 * Interoperability with java.nio.file package
 * 
 * The java.nio.filepackage defines interfaces and classes for the Java virtual
 * machine to accessfiles, file attributes, and file systems. This API may be
 * used to overcomemany of the limitations of the java.io.File class.The toPath
 * method may be used to obtain a Path that uses the abstract path represented
 * by a File object tolocate a file. The resulting Path may be used with the
 * java.nio.file.Files class to provide more efficient and extensive access
 * toadditional file operations, file attributes, and I/O exceptions to
 * helpdiagnose errors when an operation on a file fails.
 * Since:JDK1.0Author:unascribed
 */

/*
 * 
 * java.lang.String
 * 
 * 
 * The String class represents character strings. Allstring literals in Java
 * programs, such as "abc", areimplemented as instances of this class.
 * 
 * Strings are constant; their values cannot be changed after theyare created.
 * String buffers support mutable strings.Because String objects are immutable
 * they can be shared. For example:
 * 
 * String str = "abc";
 * 
 * 
 * is equivalent to:
 * 
 * char data[] = {'a', 'b', 'c'}; String str = new String(data);
 * 
 * 
 * Here are some more examples of how strings can be used:
 * 
 * System.out.println("abc"); String cde = "cde"; System.out.println("abc" +
 * cde); String c = "abc".substring(2,3); String d = cde.substring(1, 2);
 * 
 * 
 * The class String includes methods for examiningindividual characters of the
 * sequence, for comparing strings, forsearching strings, for extracting
 * substrings, and for creating acopy of a string with all characters translated
 * to uppercase or tolowercase. Case mapping is based on the Unicode Standard
 * versionspecified by the Character class.
 * 
 * The Java language provides special support for the stringconcatenation
 * operator ( + ), and for conversion ofother objects to strings. String
 * concatenation is implementedthrough the StringBuilder(or StringBuffer)class
 * and its append method.String conversions are implemented through the method
 * toString, defined by Object andinherited by all classes in Java. For
 * additional information onstring concatenation and conversion, see Gosling,
 * Joy, and Steele, The Java Language Specification.
 * 
 * Unless otherwise noted, passing a null argument to a constructoror method in
 * this class will cause a NullPointerException to bethrown.
 * 
 * A String represents a string in the UTF-16 formatin which supplementary
 * characters are represented by surrogatepairs (see the section
 * UnicodeCharacter Representations in the Character class formore
 * information).Index values refer to char code units, so a
 * supplementarycharacter uses two positions in a String.
 * 
 * The String class provides methods for dealing withUnicode code points (i.e.,
 * characters), in addition to those fordealing with Unicode code units (i.e.,
 * char values). Since:JDK1.0Author:Lee BoyntonArthur van HoffMartin BuchholzUlf
 * ZibisSee Also:java.lang.Object.toString()java.lang.StringBufferjava.lang.
 * StringBuilderjava.nio.charset.Charset
 */