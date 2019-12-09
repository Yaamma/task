package src.net.launcher.run;

public class Settings
{
        /** Настройка ссылок на соц сети */
        public static final String  vk		 = "http://vk.ru"; //Ссылка на странницу или группу ВК
        public static final String  okk		 = "http://odnoklassniki.ru"; //Ссылка на странницу или группу одноклассники
	/** Настройка заголовка лаунчера */
        
	public static final String  title		 = "      "; //Заголовок лаунчера
	public static final String  titleInGame  	 = "Minecraft"; //Заголовок лаунчера после авторизации
	public static final String  basedir	         = "AppData"; //Родительская папка для Minecraft (только для Windows) [ProgramFiles, AppData]
	public static final String  baseconf		 = ".FolberName"; //Папка с файлом конфигурации
	public static final String  pathconst		 = ".FolberName/%SERVERNAME%"; //Конструктор пути к папке с MC
	public static final String  skins                = "MinecraftSkins/"; //Папка скинов
	public static final String  cloaks               = "MinecraftCloaks/"; //Папка плащей
	/** Параметры подключения */
	public static final String  domain	 	 = "crystal-crafts.ru";//Домен сайта
	public static final String  siteDir		 = "web";//Папка с файлами лаунчера на сайте
	public static final String  updateFile		 = "http://"+ domain +"/web/Launcher.jar";//Ссылка на файл обновления лаунчера
	public static final String  buyVauncherLink      = "http://plati.ru/"; //Ссылка на страницу покупки ваучеров
	
	/** Для одиночной игры */
	public static final String  defaultUsername      = "player"; //Имя пользователя для одиночной игры
	public static final String  defaultSession       = "123456"; //Номер сессии для одиночной игры
	
	public static int height                         = 532;      //Высота окна клиента
	public static int width                          = 900;      //Ширина окна клиента
	
        /** Информаци при обнавлении, можно изменить что можно (от   =   и до  ;  )*/
        public static String  textac		 = "Сервер UPDATE: " + "upd.age-art.ru";
        public static String  textb		 = "Версия лаунчера: 0.8a"; 
        public static String  textc		 = "Пока идет обнавление"; 
        public static String  textd		 = "Сходи попей чаю или кофе"; 
        public static String  textf		 = "Или поделай пока что нибуть =)"; 
        
	// 1-> Имя папки клиента 
	// 2-> ip 
	// 3-> port 
	// 4-> Версия клиента для автопатча директории (старые версии до 1.5.2)
	// 5-> Тип запуска клиента 1 для старых версий 2 для новых
	// 6-> 1 для запуска чистого клиента 1.6.2-1.6.4
	//     2 для запуска клиента с forge без Liteloader 1.6.2-1.6.4
	//     3 для запуска клиента с Liteloader и Liteloader+forge 1.6.2
        //     4 для запуска клиента с Liteloader и Liteloader+forge 1.6.4
        
	public static String[] servers =
	{
		//Клиент для запуска в оффлайн.
		"Offline, localhost, 25565, 1.5.x, 1, none",
	};

	/** Настройка панели ссылок **/
	public static final String[] links = {"    ::"+okk,"    ::"+vk,};

	/** Настройки структуры лаунчера */
	public static boolean useAutoenter	         =  true; //Использовать функцию автозахода на выбранный сервер
	public static boolean useRegister		 =  false; //Использовать Регистрацию в лаунчере
	public static boolean useMulticlient		 =  true; //Использовать функцию "по клиенту на сервер"
	public static boolean useStandartWB		 =  true; //Использовать стандартный браузер для открытия ссылок
	public static boolean usePersonal		 =  false; //Использовать Личный кабинет
	public static boolean customframe 		 =  true; //Использовать кастомный фрейм
	public static boolean useOffline 	         =  true; //Использовать режим оффлайн
	public static boolean useConsoleHider		 =  true; //Использовать скрытие консоли клиента
	public static boolean useModCheckerTimer	 =  true; //Каждые 30 секунд моды будут перепроверяться

	public static final String protectionKey	 = "123456789"; //Ключ защиты сессии должен соответствовать значению в connect.php. Никому его не говорите.

	public static boolean debug		 	 =  false; //Отображать все действия лаунчера (отладка)(true/false)
	public static boolean drawTracers		 =  false; //Отрисовывать границы элементов лаунчера
	public static final String masterVersion  	 = "Patch 0.8.13"; //Версия лаунчера

	public static boolean patchDir 		         =  true; //Использовать автоматическую замену директории игры (true/false)
	
	public static void onStart() {}
	public static void onStartMinecraft() {}
	
}
