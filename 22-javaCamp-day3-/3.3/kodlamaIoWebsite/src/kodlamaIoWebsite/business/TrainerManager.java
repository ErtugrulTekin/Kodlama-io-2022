package kodlamaIoWebsite.business;

import kodlamaIoWebsite.core.logging.ILogger;
import kodlamaIoWebsite.dataAccess.interfaceDao.ITrainerDao;
import kodlamaIoWebsite.entities.Trainer;

public class TrainerManager {
	private final ITrainerDao trainerDao;
	private final ILogger[] loggers;
	
	public TrainerManager(ITrainerDao trainerDao, ILogger[] loggers) {
		this.trainerDao = trainerDao;
		this.loggers = loggers;
	}
	
	public void add(Trainer trainer) {
		trainerDao.add(trainer);
		for (ILogger logger : loggers) {
			logger.log(trainer.getFirstName() + " " + trainer.getLastName());
		}
	}
}
